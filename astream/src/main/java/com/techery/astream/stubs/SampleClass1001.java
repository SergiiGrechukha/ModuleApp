package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1001 {

    @Ignore    private SampleClass1002 sampleClass;

    public SampleClass1001(){
        sampleClass = new SampleClass1002();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}