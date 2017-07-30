package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1496 {

    @Ignore    private SampleClass1497 sampleClass;

    public SampleClass1496(){
        sampleClass = new SampleClass1497();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}