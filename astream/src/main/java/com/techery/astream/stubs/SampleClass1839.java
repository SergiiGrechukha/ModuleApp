package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1839 {

    @Ignore    private SampleClass1840 sampleClass;

    public SampleClass1839(){
        sampleClass = new SampleClass1840();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}