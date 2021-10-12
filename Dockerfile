FROM scratch

USER root
RUN groupadd docker
RUN usermod -u $HOST_UID jenkins
RUN groupmod -g $HOST_GID docker
RUN usermod -aG docker jenkins
USER jenkins

COPY selenoid-ui /
COPY health-check /
COPY licenses /

HEALTHCHECK --interval=30s --timeout=2s --start-period=2s --retries=2 CMD [ "/health-check" ]
EXPOSE 8080
ENTRYPOINT ["/selenoid-ui"]