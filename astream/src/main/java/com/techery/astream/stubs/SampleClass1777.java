package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1777 {

    @Ignore    private SampleClass1778 sampleClass;

    public SampleClass1777(){
        sampleClass = new SampleClass1778();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}