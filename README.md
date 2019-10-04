# CraftingJava Teapot

[![Cloud Build Status](https://storage.googleapis.com/build.craftingjava.com/build/craftingjava-teapot-master.svg)](https://github.com/sbsends/cloud-build-badge)
[![Coverage Status](http://storage.googleapis.com/build.craftingjava.com/craftingjava-teapot/test/coverage.svg)](http://storage.googleapis.com/build.craftingjava.com/craftingjava-teapot/test/jacoco/index.html)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Displays Darth Vader saying that he is a teapot along with a
[HTTP 418 error](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/418), reassuring that he
is indeed a teapot.

![](https://i.imgflip.com/3cctwe.jpg)

The reason for this app to exist is the following.

> The first version of your App Engine application must be initially deployed to the **default**
service. For subsequent versions that you deploy, the defined service is created if it does not
>already exist in your application.

I dare not to do that. You don't know the power of the Dark Side&trade;, I must obey my master and
deploy real apps not some **default** ones.

Other GAE runtimes like Go, Python or NodeJs could be used for such simple web app, but I **insist**
on using Java with Spring.

![](https://i.imgflip.com/3ccytf.jpg)

Using lighter weight languages is a pathway to rapid prototyping some consider to be unnatural.
*Rapid prototyping* is the path to the Dark Side&trade;.

**Rapid prototyping** leads to *startup ideas*, *startup ideas* leads to *founding a startup*,
*founding a startup* leads to *seeking VC funding*, *getting VC funding* leads to
*confirmation bias*, *confirmation bias* leads to a *product that noone uses*,
*a product that noone uses* leads to **suffering**.

-----

## Compile

```
% ./mvnw -B verify
```

## Local testing

```
% ./mvnw appengine:run
```

## Deploy

```
% ./mvnw appengine:deploy
```

-----

That's it folks.
