package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1586 {

    @Ignore    private SampleClass1587 sampleClass;

    public SampleClass1586(){
        sampleClass = new SampleClass1587();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}