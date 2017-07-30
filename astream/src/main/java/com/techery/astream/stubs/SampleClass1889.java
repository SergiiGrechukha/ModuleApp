package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1889 {

    @Ignore    private SampleClass1890 sampleClass;

    public SampleClass1889(){
        sampleClass = new SampleClass1890();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}