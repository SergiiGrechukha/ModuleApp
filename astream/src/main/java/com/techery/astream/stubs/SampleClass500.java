package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass500 {

    @Ignore    private SampleClass501 sampleClass;

    public SampleClass500(){
        sampleClass = new SampleClass501();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}