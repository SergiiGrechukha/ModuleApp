package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1189 {

    @Ignore    private SampleClass1190 sampleClass;

    public SampleClass1189(){
        sampleClass = new SampleClass1190();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}