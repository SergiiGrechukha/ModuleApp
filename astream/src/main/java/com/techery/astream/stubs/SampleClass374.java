package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass374 {

    @Ignore    private SampleClass375 sampleClass;

    public SampleClass374(){
        sampleClass = new SampleClass375();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}