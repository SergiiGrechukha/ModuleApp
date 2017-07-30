package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1014 {

    @Ignore    private SampleClass1015 sampleClass;

    public SampleClass1014(){
        sampleClass = new SampleClass1015();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}