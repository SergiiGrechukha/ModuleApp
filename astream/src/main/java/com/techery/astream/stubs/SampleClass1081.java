package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1081 {

    @Ignore    private SampleClass1082 sampleClass;

    public SampleClass1081(){
        sampleClass = new SampleClass1082();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}