# calva-vsc-outline-issue

Example showing when VS Code outline stops to work

It seems to be related to the use of ';' for comments at certain positions.

When the example is loaded in VS Code, core.clj will not show the outline

When the comment ';test not ok' is removed the outline works again

When an empty ';' is added at the end of core.clj the outline stops to work (the old outline will still be there but it will not update and
when the file is saved, VSC is stopped and started again, the outlook will be empty until the ';' is removed)


