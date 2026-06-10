 - It is a simple java maven project. 
   - Apache Maven:
     - it is a build and dependency management tool for java projects
     - its help in project architecture, determine and install dependency,
        run test using Jupiter (JUnit Test), compile and deploy app.
   
   - Archetype:
     - it is a project template. Maven can generate standard project structure 
       using an archetype.
   - GroupId:
     It identifies the organisation that owns the project.
   - ArtifactId:
     - acutal project name
   - Version:
     - together with groupid and artifactid, it uniquely identifies a project.
   - Repository : stores artifacts. local, central, remote.
     - maven life cycle :
       - compile
       - test
       - package
       - verify
       - install
       - deploy
     JUnit 5
     Unit test and Software Testing is two different thing. A software testing is executed after completing the 
     development and it is executed by dedicated team of tester called test engineers.
     Whereas unit testing is performed by the software developers themselves. First a unit test is developed and than
     the required functions which clears the test are written.
       - Unit Testing:
         - Prepare and set test environment
         - provide test inputs
         - run test
         - provide expected out
         - verify 
         - report the test.
     Junit 5 is completely a new unit testing system, its not junit 4 plus new features.
         user --> jupiter 5 --->platform (user use jupitur 5 api and then only platform can perform testing.) 
         inorder mentain backward compatibility we need to use vintage or extensions available.