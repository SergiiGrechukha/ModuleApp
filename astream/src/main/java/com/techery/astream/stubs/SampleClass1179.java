package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1179 {

    @Ignore    private SampleClass1180 sampleClass;

    public SampleClass1179(){
        sampleClass = new SampleClass1180();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}