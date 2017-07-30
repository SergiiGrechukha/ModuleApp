package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1691 {

    @Ignore    private SampleClass1692 sampleClass;

    public SampleClass1691(){
        sampleClass = new SampleClass1692();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}