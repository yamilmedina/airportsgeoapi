containers-build:
	docker-compose build --no-cache

containers-up: docker-assemble containers-build
	docker-compose up $(ARG)

containers-stop:
	docker-compose rm -svf && docker-compose stop

containers-restart: containers-stop containers-up

docker-assemble:
	docker run --rm       \
	-v ${HOME}/.m2:/root/.m2        \
	-v ${HOME}/.gradle:/root/.gradle \
	-v ${PWD}:/home/gradle/project      \
	-w /home/gradle/project     \
	adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.28 ./gradlew assemble $(ARG)

docker-unit-test:
	docker run --rm       \
	-v ${HOME}/.m2:/root/.m2        \
	-v ${HOME}/.gradle:/root/.gradle \
	-v ${PWD}:/home/gradle/project      \
	-w /home/gradle/project     \
	adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.28 ./gradlew test $(ARG)

