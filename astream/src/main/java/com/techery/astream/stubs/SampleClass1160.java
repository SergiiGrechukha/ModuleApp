package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1160 {

    @Ignore    private SampleClass1161 sampleClass;

    public SampleClass1160(){
        sampleClass = new SampleClass1161();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}