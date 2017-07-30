package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1476 {

    @Ignore    private SampleClass1477 sampleClass;

    public SampleClass1476(){
        sampleClass = new SampleClass1477();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}