package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1704 {

    @Ignore    private SampleClass1705 sampleClass;

    public SampleClass1704(){
        sampleClass = new SampleClass1705();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}