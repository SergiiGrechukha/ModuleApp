package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1800 {

    @Ignore    private SampleClass1801 sampleClass;

    public SampleClass1800(){
        sampleClass = new SampleClass1801();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}