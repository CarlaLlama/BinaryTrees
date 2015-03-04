JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
        $(JC) $(JFLAGS) $*.java

CLASSES = \
        BinaryTreeNode.java \
        SimpleBST.java \
        SimpleTreeWriter.java \
        SimplerTreeWriterImpl.java \
	TreeUtils.java \
	UserTreeInput.java \
	UserTreeInputTest.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
        $(RM) *.class
