containers-up:
	docker-compose up

containers-down:
	docker-compose rm -svf && docker-compose stop

containers-restart: containers-down containers-up








