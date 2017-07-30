package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1973 {

    @Ignore    private SampleClass1974 sampleClass;

    public SampleClass1973(){
        sampleClass = new SampleClass1974();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}