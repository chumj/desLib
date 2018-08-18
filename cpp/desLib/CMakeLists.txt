cmake_minimum_required(VERSION 3.0.0)
project(desLib VERSION 0.1.0)

aux_source_directory(. DIR_TOOT_SRCS)
include_directories("C:/Program Files/Java/jdk1.8.0_77/include;C:/Program Files/Java/jdk1.8.0_77/include")
#dubug 模式
set (CMAKE_CXX_FLAGS  "${CMAKE_CXX_FLAGS} -g")
ADD_LIBRARY(des SHARED des.cpp native.cpp) 
set(CPACK_PROJECT_NAME ${PROJECT_NAME})
set(CPACK_PROJECT_VERSION ${PROJECT_VERSION})
include(CPack)
