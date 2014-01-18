### play-dist-question

A test to see which application.conf file is used when you run `play dist` then run the app.

It does this by changing the value of `test.env.var` in application.conf in the external conf folder, then when you run the app the value of this var is logged by the app.

http://stackoverflow.com/questions/18968952/how-to-create-a-play-2-2-scala-application-as-an-sbt-sub-project

### Installation

    git clone git@github.com:edeustace/play-dist-question.git
    cd play-dist-question
    ./run


Then go to http://localhost:9000 and look at the logs in the console to see which env var is set.
