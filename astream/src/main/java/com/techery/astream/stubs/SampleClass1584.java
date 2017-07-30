package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1584 {

    @Ignore    private SampleClass1585 sampleClass;

    public SampleClass1584(){
        sampleClass = new SampleClass1585();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}