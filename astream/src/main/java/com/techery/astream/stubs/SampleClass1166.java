package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1166 {

    @Ignore    private SampleClass1167 sampleClass;

    public SampleClass1166(){
        sampleClass = new SampleClass1167();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}