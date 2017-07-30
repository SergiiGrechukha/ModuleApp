package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1772 {

    @Ignore    private SampleClass1773 sampleClass;

    public SampleClass1772(){
        sampleClass = new SampleClass1773();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}