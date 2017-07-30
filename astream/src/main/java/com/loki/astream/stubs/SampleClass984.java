package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass984 {

    @Ignore    private SampleClass985 sampleClass;

    public SampleClass984(){
        sampleClass = new SampleClass985();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}