package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1605 {

    @Ignore    private SampleClass1606 sampleClass;

    public SampleClass1605(){
        sampleClass = new SampleClass1606();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}