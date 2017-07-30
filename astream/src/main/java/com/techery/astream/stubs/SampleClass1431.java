package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1431 {

    @Ignore    private SampleClass1432 sampleClass;

    public SampleClass1431(){
        sampleClass = new SampleClass1432();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}