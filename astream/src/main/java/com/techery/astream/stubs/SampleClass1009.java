package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1009 {

    @Ignore    private SampleClass1010 sampleClass;

    public SampleClass1009(){
        sampleClass = new SampleClass1010();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}