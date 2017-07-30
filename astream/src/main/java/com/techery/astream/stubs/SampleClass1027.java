package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1027 {

    @Ignore    private SampleClass1028 sampleClass;

    public SampleClass1027(){
        sampleClass = new SampleClass1028();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}