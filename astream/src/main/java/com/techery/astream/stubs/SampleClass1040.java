package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1040 {

    @Ignore    private SampleClass1041 sampleClass;

    public SampleClass1040(){
        sampleClass = new SampleClass1041();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}