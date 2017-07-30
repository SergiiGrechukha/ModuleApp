package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass244 {

    @Ignore    private SampleClass245 sampleClass;

    public SampleClass244(){
        sampleClass = new SampleClass245();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}