package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass385 {

    @Ignore    private SampleClass386 sampleClass;

    public SampleClass385(){
        sampleClass = new SampleClass386();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}