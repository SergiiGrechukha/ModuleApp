package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass439 {

    @Ignore    private SampleClass440 sampleClass;

    public SampleClass439(){
        sampleClass = new SampleClass440();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}