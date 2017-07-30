package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1899 {

    @Ignore    private SampleClass1900 sampleClass;

    public SampleClass1899(){
        sampleClass = new SampleClass1900();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}