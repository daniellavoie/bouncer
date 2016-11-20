FROM java:openjdk-8-alpine

MAINTAINER Daniel Lavoie <daniel.lavoie@invivoo.com>

EXPOSE 8080

CMD ["java", "-jar", "/srv/bouncer/bouncer.jar"]

ADD target/bouncer.jar /srv/bouncer/bouncer.jar