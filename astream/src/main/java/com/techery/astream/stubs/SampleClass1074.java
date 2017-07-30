package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1074 {

    @Ignore    private SampleClass1075 sampleClass;

    public SampleClass1074(){
        sampleClass = new SampleClass1075();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}