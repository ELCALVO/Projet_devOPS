
FROM "version-jdk" 
RUN java -version
COPY "repertoire reception image"
WORKDIR "repertoire reception image"
RUN apk add maven && mvn --version
RUN mvn package
RUN javac -cp "dossier/jar" "dossier_docker/fichier.java"
CMD java -cp  "dossier/jar:docker"  "fichier"
