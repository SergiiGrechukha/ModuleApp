package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1638 {

    @Ignore    private SampleClass1639 sampleClass;

    public SampleClass1638(){
        sampleClass = new SampleClass1639();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}