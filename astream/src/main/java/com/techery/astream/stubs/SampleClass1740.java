package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1740 {

    @Ignore    private SampleClass1741 sampleClass;

    public SampleClass1740(){
        sampleClass = new SampleClass1741();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}