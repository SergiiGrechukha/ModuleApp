package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1048 {

    @Ignore    private SampleClass1049 sampleClass;

    public SampleClass1048(){
        sampleClass = new SampleClass1049();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}