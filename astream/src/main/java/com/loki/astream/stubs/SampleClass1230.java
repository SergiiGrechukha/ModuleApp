package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1230 {

    @Ignore    private SampleClass1231 sampleClass;

    public SampleClass1230(){
        sampleClass = new SampleClass1231();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}