package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1746 {

    @Ignore    private SampleClass1747 sampleClass;

    public SampleClass1746(){
        sampleClass = new SampleClass1747();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}