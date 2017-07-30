package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1514 {

    @Ignore    private SampleClass1515 sampleClass;

    public SampleClass1514(){
        sampleClass = new SampleClass1515();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}