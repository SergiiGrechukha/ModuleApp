package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1149 {

    @Ignore    private SampleClass1150 sampleClass;

    public SampleClass1149(){
        sampleClass = new SampleClass1150();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}