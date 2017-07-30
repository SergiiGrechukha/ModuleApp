package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass126 {

    @Ignore    private SampleClass127 sampleClass;

    public SampleClass126(){
        sampleClass = new SampleClass127();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}