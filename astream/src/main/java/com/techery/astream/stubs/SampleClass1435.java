package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1435 {

    @Ignore    private SampleClass1436 sampleClass;

    public SampleClass1435(){
        sampleClass = new SampleClass1436();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}