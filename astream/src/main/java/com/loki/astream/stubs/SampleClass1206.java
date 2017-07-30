package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1206 {

    @Ignore    private SampleClass1207 sampleClass;

    public SampleClass1206(){
        sampleClass = new SampleClass1207();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}