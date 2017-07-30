package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1104 {

    @Ignore    private SampleClass1105 sampleClass;

    public SampleClass1104(){
        sampleClass = new SampleClass1105();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}