package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1670 {

    @Ignore    private SampleClass1671 sampleClass;

    public SampleClass1670(){
        sampleClass = new SampleClass1671();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}